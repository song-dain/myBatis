package com.ambition.board;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSourceTest {

	@Inject
	private DataSource ds;
	
	@Test
	public void testConnection() throws Exception {
		
		try (Connection con = ds.getConnection()){
			System.out.println("DB 연결 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
