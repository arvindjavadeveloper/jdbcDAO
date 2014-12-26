package com.aic.common.dao.jdbc;

import com.aic.common.dao.domain.Simple;

public interface SimpleNamedParameterJdbcTemplateDao {

    public int insert(String string);

    public int update(int i);

    public int delete(int i);
    
    public int selectWithUuid(String uuid);
    
    public String getUuid(int i);

    public Simple showDomainObj(int i);
    
    public void executePlSql();
    
}
