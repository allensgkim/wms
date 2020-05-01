package com.brazil.cerp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.brazil.cerp.mapper.user.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
class CerpApplicationTests {
	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testUserMapper() throws Exception {
		System.out.println("--------------------test----------------->");
		
		/*
		 * UserVO user = userMapper.getLoginInfor("test"); System.out.println("User >> "
		 * + user); assertEquals("홍길동", user.getName());
		 * 
		 * System.out.println("user >> " + user.getName());
		 */
	}

	@Ignore @Test
	public void testDataSource() throws Exception  {
		System.out.println("DS=" + ds);
		
		try(Connection conn = ds.getConnection()) {
			System.out.println("Coooooooooonn=" + conn);
			assertThat(conn).isInstanceOf(Connection.class);
			
			assertEquals(100, getLong(conn, "select 100"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private long getLong(Connection conn, String sql) {
		long result = 0;
		try(Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				result = rs.getLong(1);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
