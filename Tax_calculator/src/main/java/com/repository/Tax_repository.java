package com.repository;


import com.domain.Tax_detail;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

@Repository
public class Tax_repository {

    private DataSource dataSource;

    private static final String CREATE = "insert into tax_info (Taxable_income, Tax) values (?, ?)";

    public Tax_repository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public boolean create(Tax_detail tax_detail) throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(CREATE);
        preparedStatement.setInt(1, tax_detail.getTaxable_income_year());
        preparedStatement.setDouble(2, tax_detail.getTax());
        return preparedStatement.execute();
    }


}
