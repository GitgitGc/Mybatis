package test.Test;

import java.util.HashMap;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import test.MybatisUtils.MyBatisUtil;

public class Test2 {

	@Test
	public void testGetUserCount(){
		SqlSession session = MyBatisUtil.getSqlSession(true);
		String statement = "test.mapping.classMapper.getUserCount";
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("sexid", 1);
		map.put("usercount", -1);
		session.selectOne(statement, map);
		Integer result = map.get("usercount");
		System.out.println(result);
		session.close();
	}
}
