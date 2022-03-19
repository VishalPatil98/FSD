package ecommerce.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ecommerce.entity.ProductEntity;

public class ProductDAO 
{
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) 
	{
		this.template = template;
	}
	public List<ProductEntity> getproduts()
	{
		return template.query("select * from product",new RowMapper<ProductEntity>() //RowMapper is interface
		{
			public ProductEntity mapRow(ResultSet rs, int rowNum) throws SQLException //abstract method of row mapper
			{
				ProductEntity e=new ProductEntity();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPrice(rs.getInt(3));
				e.setQuantity(rs.getInt(4));
				return e;
			}
		});
	}
}
