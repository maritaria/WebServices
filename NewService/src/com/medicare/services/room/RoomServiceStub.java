
/**
 * RoomServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.room;

/*
*  RoomServiceStub java implementation
*/

public class RoomServiceStub extends org.apache.axis2.client.Stub {
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("RoomService" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[4];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://medicare.com/Services/Room", "getAll"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://medicare.com/Services/Room", "init"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://medicare.com/Services/Room", "reservate"));
		_service.addOperation(__operation);

		_operations[2] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://medicare.com/Services/Room", "find"));
		_service.addOperation(__operation);

		_operations[3] = __operation;

	}

	// populates the faults
	private void populateFaults() {

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public RoomServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public RoomServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

		_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

	}

	/**
	 * Default Constructor
	 */
	public RoomServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext)
			throws org.apache.axis2.AxisFault {

		this(configurationContext, "http://localhost:8080/NewService/services/RoomService");

	}

	/**
	 * Default Constructor
	 */
	public RoomServiceStub() throws org.apache.axis2.AxisFault {

		this("http://localhost:8080/NewService/services/RoomService");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public RoomServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.medicare.services.room.RoomService#getAll
	 */

	public com.medicare.services.room.RoomArrayResponse getAll(

	)

			throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("http://medicare.com/Services/Room/GetAll");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			// Style is taken to be "document". No input parameters
			// according to the WS-Basic profile in this case we have to send an empty soap
			// message
			org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions().getSoapVersionURI());
			env = factory.getDefaultEnvelope();

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					com.medicare.services.room.RoomArrayResponse.class, getEnvelopeNamespaces(_returnEnv));

			return (com.medicare.services.room.RoomArrayResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetAll"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetAll"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetAll"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.medicare.services.room.RoomService#startgetAll
	 */
	public void startgetAll(

			final com.medicare.services.room.RoomServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("http://medicare.com/Services/Room/GetAll");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is taken to be "document". No input parameters
		// according to the WS-Basic profile in this case we have to send an empty soap
		// message
		org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions().getSoapVersionURI());
		env = factory.getDefaultEnvelope();

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.medicare.services.room.RoomArrayResponse.class, getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetAll((com.medicare.services.room.RoomArrayResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetAll(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap
								.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetAll"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetAll"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetAll"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorgetAll(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAll(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAll(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAll(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAll(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAll(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAll(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAll(f);
							}
						} else {
							callback.receiveErrorgetAll(f);
						}
					} else {
						callback.receiveErrorgetAll(f);
					}
				} else {
					callback.receiveErrorgetAll(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetAll(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.medicare.services.room.RoomService#init
	 */

	public com.medicare.services.room.RoomArrayResponse init(

	)

			throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("http://medicare.com/Services/Room/init");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			// Style is taken to be "document". No input parameters
			// according to the WS-Basic profile in this case we have to send an empty soap
			// message
			org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions().getSoapVersionURI());
			env = factory.getDefaultEnvelope();

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					com.medicare.services.room.RoomArrayResponse.class, getEnvelopeNamespaces(_returnEnv));

			return (com.medicare.services.room.RoomArrayResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Init"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Init"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Init"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.medicare.services.room.RoomService#startinit
	 */
	public void startinit(

			final com.medicare.services.room.RoomServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("http://medicare.com/Services/Room/init");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is taken to be "document". No input parameters
		// according to the WS-Basic profile in this case we have to send an empty soap
		// message
		org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions().getSoapVersionURI());
		env = factory.getDefaultEnvelope();

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.medicare.services.room.RoomArrayResponse.class, getEnvelopeNamespaces(resultEnv));
					callback.receiveResultinit((com.medicare.services.room.RoomArrayResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorinit(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap
								.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Init"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Init"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Init"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorinit(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinit(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinit(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinit(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinit(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinit(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinit(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinit(f);
							}
						} else {
							callback.receiveErrorinit(f);
						}
					} else {
						callback.receiveErrorinit(f);
					}
				} else {
					callback.receiveErrorinit(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorinit(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.medicare.services.room.RoomService#reservate
	 * @param reservate65
	 * 
	 */

	public void reservate(

			com.medicare.services.room.Reservate reservate65)

			throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[2].getName());
			_operationClient.getOptions().setAction("http://medicare.com/Services/Room/Reservate");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), reservate65,
					optimizeContent(new javax.xml.namespace.QName("http://medicare.com/Services/Room", "reservate")),
					new javax.xml.namespace.QName("http://medicare.com/Services/Room", "reservate"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Reservate"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Reservate"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Reservate"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.medicare.services.room.RoomService#startreservate
	 * @param reservate65
	 * 
	 */
	public void startreservate(

			com.medicare.services.room.Reservate reservate65,

			final com.medicare.services.room.RoomServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[2].getName());
		_operationClient.getOptions().setAction("http://medicare.com/Services/Room/Reservate");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), reservate65,
				optimizeContent(new javax.xml.namespace.QName("http://medicare.com/Services/Room", "reservate")),
				new javax.xml.namespace.QName("http://medicare.com/Services/Room", "reservate"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[2].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.medicare.services.room.RoomService#find
	 * @param findFilter67
	 * 
	 */

	public com.medicare.services.room.RoomArrayResponse find(

			com.medicare.services.room.FindFilter findFilter67)

			throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[3].getName());
			_operationClient.getOptions().setAction("http://medicare.com/Services/Room/Find");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), findFilter67,
					optimizeContent(new javax.xml.namespace.QName("http://medicare.com/Services/Room", "find")),
					new javax.xml.namespace.QName("http://medicare.com/Services/Room", "find"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					com.medicare.services.room.RoomArrayResponse.class, getEnvelopeNamespaces(_returnEnv));

			return (com.medicare.services.room.RoomArrayResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Find"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Find"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Find"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.medicare.services.room.RoomService#startfind
	 * @param findFilter67
	 * 
	 */
	public void startfind(

			com.medicare.services.room.FindFilter findFilter67,

			final com.medicare.services.room.RoomServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[3].getName());
		_operationClient.getOptions().setAction("http://medicare.com/Services/Room/Find");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), findFilter67,
				optimizeContent(new javax.xml.namespace.QName("http://medicare.com/Services/Room", "find")),
				new javax.xml.namespace.QName("http://medicare.com/Services/Room", "find"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.medicare.services.room.RoomArrayResponse.class, getEnvelopeNamespaces(resultEnv));
					callback.receiveResultfind((com.medicare.services.room.RoomArrayResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorfind(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap
								.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Find"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Find"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Find"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorfind(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorfind(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorfind(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorfind(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorfind(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorfind(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorfind(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorfind(f);
							}
						} else {
							callback.receiveErrorfind(f);
						}
					} else {
						callback.receiveErrorfind(f);
					}
				} else {
					callback.receiveErrorfind(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorfind(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[3].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[3].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	// http://localhost:8080/NewService/services/RoomService
	private org.apache.axiom.om.OMElement toOM(com.medicare.services.room.RoomArrayResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.services.room.RoomArrayResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.services.room.Reservate param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.services.room.Reservate.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.services.room.FindFilter param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.services.room.FindFilter.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.medicare.services.room.Reservate param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(com.medicare.services.room.Reservate.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.medicare.services.room.FindFilter param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(com.medicare.services.room.FindFilter.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type,
			java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

		try {

			if (com.medicare.services.room.FindFilter.class.equals(type)) {

				return com.medicare.services.room.FindFilter.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.services.room.Reservate.class.equals(type)) {

				return com.medicare.services.room.Reservate.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.services.room.RoomArrayResponse.class.equals(type)) {

				return com.medicare.services.room.RoomArrayResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
