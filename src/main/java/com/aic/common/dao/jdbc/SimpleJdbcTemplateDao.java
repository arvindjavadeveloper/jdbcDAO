package com.aic.common.dao.jdbc;

import java.util.List;

import com.aic.common.dao.domain.Simple;

public interface SimpleJdbcTemplateDao {

    public int insert(String string);

    public int update(int i);

    public int delete(int i);

    public int selectAll();
    
    public int selectWithUuid(String uuid);
    
    public String getUuid(int i);

    public Simple showDomainObj(int i);
    
    public List<Simple> showDomainObj();
    
    public void executeDdl();
    
    public void executePlSql();
    
}
