package com.hms.dao.service;

public interface SchemaDao {
	void createTables(String hmsTablesFilePath);
	void dropTables(String hmsTablesFilePath);
}
