/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.redhat.sapem;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Logger;


@javax.jws.WebService(serviceName = "sapWS", portName = "sapWSPort",
                    targetNamespace = "http://service.ws.sample/", 
                    endpointInterface = "com.redhat.sapem.SapWS")
public class SapWSImpl implements SapWS {

    private static final Logger LOG = Logger.getLogger(SapWSImpl.class.getName());


	@Override
	public ProductInfo[] getProductInfo(ProductQuery query)  {
		LOG.info("query content:\n" + query);
		ProductInfo [] productInfo = new ProductInfo[query.getProductIds().length * 2];
		for (int i = 0; i < query.getProductIds().length; i++)
			try {
				{
					
					ProductInfo info1 = new ProductInfo();
					
					info1.setProductId(query.getProductIds()[i]);
					info1.setArrivalDate(new SimpleDateFormat( "yyyy-MM-dd" ).parse(query.getArrivalDate()));
					info1.setDayId("1");
					info1.setDayOfWeek("Monday");
					info1.setDescription("AM");
					
					Calendar cal = Calendar.getInstance();
					cal.setTime(info1.getArrivalDate());
					cal.add(Calendar.DATE, -2);
					info1.setDispatchDate(cal.getTime());
					info1.setEndTime("10:00");
					info1.setStartTime("09:00");
					info1.setTsId("1");
					info1.setType("ATL");
					
					
					ProductInfo info = new ProductInfo();
					info.setArrivalDate(info1.getArrivalDate());
					info.setArrivalDayOfWeek(info1.getDayOfWeek());
					info.setDayId(info1.getDayId());
					info.setDayOfWeek(info1.getDayOfWeek());
					info.setDescription(info1.getDescription());
					info.setDispatchDate(info1.getDispatchDate());
					info.setEndTime(info1.getEndTime());
					info.setProductId(info1.getProductId());
					info.setStartTime(info1.getStartTime());
					info.setTsId(info1.getTsId());
					info.setType("COLLECT");
					
					productInfo[i] = info1;
					productInfo[i + query.getProductIds().length] = info;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return productInfo;
	}

}
