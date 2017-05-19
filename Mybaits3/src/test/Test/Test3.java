package test.Test;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import test.MybatisUtils.MyBatisUtil;
import test.pojo.User;

public class Test3 {

	@Test
	public void testGetUser(){
		SqlSession session = MyBatisUtil.getSqlSession(true);
		String statement = "test.mapping.userMapper.getUser";
		User user = session.selectOne(statement, 1);
		System.out.println(user);
		
		user = session.selectOne(statement, 2);
		System.out.println(user);
		
		session.clearCache();
		user = session.selectOne(statement,3);
		System.out.println(user);
		
	}
}
