package test.Test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import test.MybatisUtils.MyBatisUtil;
import test.pojo.User;

public class Test4 {

	@Test
	public void testCache(){
		SqlSessionFactory sqlFactory = MyBatisUtil.getSqlSessionFactory();
		String statement = "test.mapping.userMapper.getUser";
		SqlSession session1 = sqlFactory.openSession();
		SqlSession session2 = sqlFactory.openSession();
		
		User user = session1.selectOne(statement, 1);
		session1.commit();
		System.out.println("user1="+user);
		
		user = session2.selectOne(statement, 1);
		System.out.println("user2="+user);
	}
}
