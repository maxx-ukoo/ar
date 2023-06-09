<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<databaseChangeLog logicalFilePath="db.changelog-1.0.xml" xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
                   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                   xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-3.4.xsd">
    <changeSet author="maxx" id="12032023-160600-1">
            <createTable tableName="unit">
                <column name="id" type="BIGINT">
                    <constraints nullable="false"/>
                </column>
                <column name="name" type="VARCHAR(50)">
                    <constraints nullable="false"/>
                </column>
            </createTable>
    </changeSet>
</databaseChangeLog>