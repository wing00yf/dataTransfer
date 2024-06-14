package com.dataTransfer.db.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class DatabaseTestBase {
	private static Connection jdbcConnection;
	private IDatabaseConnection dbUnitConnection;
	
	private static String backupFilePath = "/backupData.xml";
	private static String insertFilePath = "/insertData.xml";
	
	private boolean backupDb = false;
	
	private boolean initialData = false;
	
	public DatabaseTestBase(boolean backupSet, boolean initial){
		backupDb = backupSet;
		initialData = initial;
	}
	
	@BeforeAll
	protected static void initAll() throws SQLException, FileNotFoundException, DatabaseUnitException, IOException{
		String dbUrl ="jdbc:mysql://localhost:3306/infordata?serverTimezone=UTC";
		String name ="root";
		String password = "Root123$%";
		
		jdbcConnection = DriverManager.getConnection(dbUrl,name,password);
		jdbcConnection.setAutoCommit(false);
		
	}
	
	@BeforeEach
	protected void setUp() throws FileNotFoundException, DatabaseUnitException, SQLException, IOException {
		if(backupDb) {
			backUp();
		}
		if(initialData) {
			insertData2Db(insertFilePath);
		}
	}
	
	
	protected void backUp() throws DatabaseUnitException, SQLException, FileNotFoundException, IOException{
		dbUnitConnection = new DatabaseConnection(jdbcConnection);
		
		IDataSet dataSet = dbUnitConnection.createDataSet();
		FlatXmlDataSet.write(dataSet, new FileOutputStream(new File(this.getClass().getResource(backupFilePath).getFile().toString())));
	}
	
	protected void insertData2Db(String fileName) throws DatabaseUnitException, SQLException {
		IDataSet dataSet = new FlatXmlDataSetBuilder().build(this.getClass().getResourceAsStream(fileName));
	    DatabaseOperation.CLEAN_INSERT.execute(dbUnitConnection,dataSet);
	}
	
	@AfterEach
	public void tearDown() throws SQLException {
		jdbcConnection.rollback();
	}
	
	@AfterAll
	public static void cloaseDb() throws SQLException {
		if(jdbcConnection != null) {
			jdbcConnection.close();
		}
	}
}
