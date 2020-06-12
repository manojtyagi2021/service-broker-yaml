package com.example.servicebroker;


import org.springframework.cloud.appbroker.service.CreateServiceInstanceWorkflow;
import org.springframework.cloud.appbroker.service.DeleteServiceInstanceWorkflow;
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
public class DeleteServiceInstanceWorkflowImpl implements DeleteServiceInstanceWorkflow{
	
	private static final Logger logger = Loggers.getLogger(DeleteServiceInstanceWorkflowImpl.class);

	public Mono<Void> create(CreateServiceInstanceRequest request,
			CreateServiceInstanceResponse response) {
		logger.info("*****************DeleteServiceInstanceWorkflowImpl started***************************");
		logger.info("*****************DeleteServiceInstanceWorkflowImpl create method calling***************************");
		logger.info("request="+request.toString());
		
		logger.info("response="+response.toString());
		logger.info("*****************DeleteServiceInstanceWorkflowImpl create method ended***************************");
		
			return Mono.empty();
		}

		public Mono<Boolean> accept(CreateServiceInstanceRequest request) {
			logger.info("*****************DeleteServiceInstanceWorkflowImpl accept method calling***************************");
			logger.info("request="+request.toString());
			
			logger.info("*****************DeleteServiceInstanceWorkflowImpl accept method ended***************************");
		
			return Mono.just(true);
		}

	public Mono<CreateServiceInstanceResponseBuilder> buildResponse(CreateServiceInstanceRequest request,
		CreateServiceInstanceResponseBuilder responseBuilder) {
		System.out.println("************************************************************************************");
		logger.info("*****************DeleteServiceInstanceWorkflowImpl buildResponse method calling***************************");
		logger.info("request="+request.toString());
		
		System.out.println("********request.getParameters()***************"+request.getParameters());
		logger.info("responseBuilder="+responseBuilder.toString());
		logger.info("*****************DeleteServiceInstanceWorkflowImpl buildResponse method ended***************************");
		
		return Mono.just(responseBuilder);
		}

}
