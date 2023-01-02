package com.repository;


import com.domain.Tax_detail;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Tax_repository {

    private DataSource dataSource;

    private static final String ALL = "select idTax_info, Taxable_income, Tax from tax_info";

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

    public List<Tax_detail> list() throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(ALL);
        return mapper(resultSet);
    }

    private List<Tax_detail> mapper(ResultSet resultSet) throws SQLException {
        List<Tax_detail> tax_details = new ArrayList<>();
        while(resultSet.next()) {
            Tax_detail tax_detail = new Tax_detail();
            tax_detail.setId(resultSet.getInt(1));
            tax_detail.setTaxable_income_year(resultSet.getInt(2));
            tax_detail.setTax(resultSet.getDouble(3));
            tax_details.add(tax_detail);
        }
        return tax_details;
    }


}
