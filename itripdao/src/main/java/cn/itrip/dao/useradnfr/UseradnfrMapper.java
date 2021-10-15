package cn.itrip.dao.useradnfr;
import cn.itrip.pojo.Useradnfr;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface UseradnfrMapper {

	public Useradnfr getUseradnfrById(@Param(value = "id") Long id)throws Exception;

	public List<Useradnfr>	getUseradnfrListByMap(Map<String, Object> param)throws Exception;

	public Integer getUseradnfrCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertUseradnfr(Useradnfr useradnfr)throws Exception;

	public Integer updateUseradnfr(Useradnfr useradnfr)throws Exception;

	public Integer deleteUseradnfrById(@Param(value = "id") Long id)throws Exception;

}
