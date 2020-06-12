package com.example.servicebroker;


import org.springframework.cloud.appbroker.service.CreateServiceInstanceWorkflow;
import org.springframework.cloud.appbroker.service.UpdateServiceInstanceWorkflow;
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
public class UpdateServiceInstanceWorkflowImpl implements UpdateServiceInstanceWorkflow{
	
	private static final Logger logger = Loggers.getLogger(UpdateServiceInstanceWorkflowImpl.class);

	public Mono<Void> create(CreateServiceInstanceRequest request,
			CreateServiceInstanceResponse response) {
		logger.info("*****************UpdateServiceInstanceWorkflowImpl started***************************");
		logger.info("*****************UpdateServiceInstanceWorkflowImpl create method calling***************************");
		logger.info("request="+request.toString());
		
		logger.info("response="+response.toString());
		logger.info("*****************UpdateServiceInstanceWorkflowImpl create method ended***************************");
		
			return Mono.empty();
		}

		public Mono<Boolean> accept(CreateServiceInstanceRequest request) {
			logger.info("*****************UpdateServiceInstanceWorkflowImpl accept method calling***************************");
			logger.info("request="+request.toString());
			
			logger.info("*****************UpdateServiceInstanceWorkflowImpl accept method ended***************************");
		
			return Mono.just(true);
		}

	public Mono<CreateServiceInstanceResponseBuilder> buildResponse(CreateServiceInstanceRequest request,
		CreateServiceInstanceResponseBuilder responseBuilder) {
		System.out.println("************************************************************************************");
		logger.info("*****************UpdateServiceInstanceWorkflowImpl buildResponse method calling***************************");
		logger.info("request="+request.toString());
		
		System.out.println("********request.getParameters()***************"+request.getParameters());
		logger.info("responseBuilder="+responseBuilder.toString());
		logger.info("*****************UpdateServiceInstanceWorkflowImpl buildResponse method ended***************************");
		
		return Mono.just(responseBuilder);
		}

}
