package com.example.servicebroker;

import org.springframework.cloud.appbroker.service.CreateServiceInstanceAppBindingWorkflow;
import org.springframework.cloud.servicebroker.model.binding.CreateServiceInstanceBindingRequest;
import org.springframework.stereotype.Service;
import org.springframework.cloud.servicebroker.model.binding.CreateServiceInstanceAppBindingResponse.CreateServiceInstanceAppBindingResponseBuilder;

import reactor.core.publisher.Mono;
@Service
public class CreateServiceInstanceAppBindingWorkflowImpl implements CreateServiceInstanceAppBindingWorkflow {

	public Mono<CreateServiceInstanceAppBindingResponseBuilder> buildResponse(
			CreateServiceInstanceBindingRequest request,
			CreateServiceInstanceAppBindingResponseBuilder responseBuilder) {
		responseBuilder.credentials("url", "workflowurl").credentials("username", "workflowusername").credentials("password","pass").build();
			return Mono.just(responseBuilder);
		}
}
