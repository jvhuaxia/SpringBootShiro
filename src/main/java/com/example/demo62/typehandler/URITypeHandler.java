package com.example.demo62.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class URITypeHandler extends BaseTypeHandler<List<String>> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<String> list, JdbcType jdbcType) throws SQLException {
        StringBuilder result = new StringBuilder();
        for (String value : list) {
            result.append(value).append(",");
        }
        result.deleteCharAt(result.length() - 1);
        preparedStatement.setString(i, result.toString());
    }

    @Override
    public List<String> getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return getStringArray(resultSet.getString(s));
    }

    @Override
    public List<String> getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return getStringArray(resultSet.getString(i));
    }

    @Override
    public List<String> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return getStringArray(callableStatement.getString(i));
    }

    private List<String> getStringArray(String columnValue) {
        if (columnValue == null) {
            return null;
        }
        return Arrays.asList(columnValue.split(","));
    }
}
