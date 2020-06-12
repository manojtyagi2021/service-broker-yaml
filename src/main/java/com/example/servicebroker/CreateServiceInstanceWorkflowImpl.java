package com.example.servicebroker;


import org.springframework.cloud.appbroker.service.CreateServiceInstanceWorkflow;
import org.springframework.cloud.servicebroker.model.instance.CreateServiceInstanceRequest;
import org.springframework.cloud.servicebroker.model.instance.CreateServiceInstanceResponse;
import org.springframework.cloud.servicebroker.model.instance.CreateServiceInstanceResponse.CreateServiceInstanceResponseBuilder;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;
import reactor.util.Logger;
import reactor.util.Loggers;

@Order(value=1)
@Service
public class CreateServiceInstanceWorkflowImpl implements CreateServiceInstanceWorkflow{
	
	private static final Logger logger = Loggers.getLogger(CreateServiceInstanceWorkflowImpl.class);

	public Mono<Void> create(CreateServiceInstanceRequest request,
			CreateServiceInstanceResponse response) {
		logger.info("*****************CreateServiceInstanceWorkflowImpl started***************************");
		logger.info("*****************CreateServiceInstanceWorkflowImpl create method calling***************************");
		logger.info("request="+request.toString());
		
		logger.info("response="+response.toString());
		logger.info("*****************CreateServiceInstanceWorkflowImpl create method ended***************************");
		
			return Mono.empty();
		}

		public Mono<Boolean> accept(CreateServiceInstanceRequest request) {
			logger.info("*****************CreateServiceInstanceWorkflowImpl accept method calling***************************");
			logger.info("request="+request.toString());
			
			logger.info("*****************CreateServiceInstanceWorkflowImpl accept method ended***************************");
		
			return Mono.just(true);
		}

	public Mono<CreateServiceInstanceResponseBuilder> buildResponse(CreateServiceInstanceRequest request,
		CreateServiceInstanceResponseBuilder responseBuilder) {
		System.out.println("************************************************************************************");
		logger.info("*****************CreateServiceInstanceWorkflowImpl buildResponse method calling***************************");
		logger.info("request="+request.toString());
		
		System.out.println("********request.getParameters()***************"+request.getParameters());
		logger.info("responseBuilder="+responseBuilder.toString());
		logger.info("*****************CreateServiceInstanceWorkflowImpl buildResponse method ended***************************");
		
		
		
		return Mono.just(responseBuilder);
		}

}
