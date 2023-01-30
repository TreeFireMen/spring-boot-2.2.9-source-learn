package com.hand.springbootdataaccess.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-30
 */
public class RoutingDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return RoutingDataSourceContext.getDataSourceRoutingKey();
	}
}
