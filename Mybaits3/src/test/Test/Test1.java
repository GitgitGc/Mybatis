package test.Test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import test.MybatisUtils.MyBatisUtil;
import test.pojo.Class;

public class Test1 {

	@Test
	public void testGetClass(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "test.mapping.classMapper.getClass3";
		Class class1 = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(class1);
	}
	
	
}
