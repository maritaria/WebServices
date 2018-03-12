
/**
 * PatientServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.patient;

/*
*  PatientServiceStub java implementation
*/

public class PatientServiceStub extends org.apache.axis2.client.Stub {
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
		_service = new org.apache.axis2.description.AxisService("PatientService" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[3];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "register"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "notify"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "getAll"));
		_service.addOperation(__operation);

		_operations[2] = __operation;

	}

	// populates the faults
	private void populateFaults() {

		faultExceptionNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://medicare.com/Types", "error"), "Register"),
				"com.medicare.services.patient.RegisterFault");
		faultExceptionClassNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://medicare.com/Types", "error"), "Register"),
				"com.medicare.services.patient.RegisterFault");
		faultMessageMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://medicare.com/Types", "error"), "Register"),
				"com.medicare.types.Error");

		faultExceptionNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://medicare.com/Types", "error"), "Notify"),
				"com.medicare.services.patient.NotifyFaultException");
		faultExceptionClassNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://medicare.com/Types", "error"), "Notify"),
				"com.medicare.services.patient.NotifyFaultException");
		faultMessageMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://medicare.com/Types", "error"), "Notify"),
				"com.medicare.types.Error");

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public PatientServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public PatientServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
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
	public PatientServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext)
			throws org.apache.axis2.AxisFault {

		this(configurationContext, "http://localhost:8080/NewService/services/PatientService");

	}

	/**
	 * Default Constructor
	 */
	public PatientServiceStub() throws org.apache.axis2.AxisFault {

		this("http://localhost:8080/NewService/services/PatientService");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public PatientServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.medicare.services.patient.PatientService#register
	 * @param person44
	 * 
	 * @throws com.medicare.services.patient.RegisterFault
	 *             :
	 */

	public com.medicare.types.PatientE register(

			com.medicare.types.PersonE person44)

			throws java.rmi.RemoteException

			, com.medicare.services.patient.RegisterFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("http://medicare.com/Services/Patient/Register");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), person44,
					optimizeContent(new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "register")),
					new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "register"));

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

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), com.medicare.types.PatientE.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.medicare.types.PatientE) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Register"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Register"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Register"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.medicare.services.patient.RegisterFault) {
							throw (com.medicare.services.patient.RegisterFault) ex;
						}

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
	 * @see com.medicare.services.patient.PatientService#startregister
	 * @param person44
	 * 
	 */
	public void startregister(

			com.medicare.types.PersonE person44,

			final com.medicare.services.patient.PatientServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("http://medicare.com/Services/Patient/Register");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), person44,
				optimizeContent(new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "register")),
				new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "register"));

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
							com.medicare.types.PatientE.class, getEnvelopeNamespaces(resultEnv));
					callback.receiveResultregister((com.medicare.types.PatientE) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorregister(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Register"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Register"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Register"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								if (ex instanceof com.medicare.services.patient.RegisterFault) {
									callback.receiveErrorregister((com.medicare.services.patient.RegisterFault) ex);
									return;
								}

								callback.receiveErrorregister(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorregister(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorregister(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorregister(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorregister(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorregister(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorregister(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorregister(f);
							}
						} else {
							callback.receiveErrorregister(f);
						}
					} else {
						callback.receiveErrorregister(f);
					}
				} else {
					callback.receiveErrorregister(error);
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
					callback.receiveErrorregister(axisFault);
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
	 * @see com.medicare.services.patient.PatientService#notify
	 * @param notify46
	 * 
	 * @throws com.medicare.services.patient.NotifyFaultException
	 *             :
	 */

	public void notify(

			com.medicare.services.patient.Notify notify46)

			throws java.rmi.RemoteException

			, com.medicare.services.patient.NotifyFaultException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("http://medicare.com/Services/Patient/Notify");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), notify46,
					optimizeContent(new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "notify")),
					new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "notify"));

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
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Notify"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Notify"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Notify"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.medicare.services.patient.NotifyFaultException) {
							throw (com.medicare.services.patient.NotifyFaultException) ex;
						}

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
	 * @see com.medicare.services.patient.PatientService#startnotify
	 * @param notify46
	 * 
	 */
	public void startnotify(

			com.medicare.services.patient.Notify notify46,

			final com.medicare.services.patient.PatientServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("http://medicare.com/Services/Patient/Notify");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), notify46,
				optimizeContent(new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "notify")),
				new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "notify"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

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
	 * @see com.medicare.services.patient.PatientService#getAll
	 */

	public com.medicare.types.Patients getAll(

	)

			throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[2].getName());
			_operationClient.getOptions().setAction("http://medicare.com/Services/Patient/GetAll");
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

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), com.medicare.types.Patients.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.medicare.types.Patients) object;

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
	 * @see com.medicare.services.patient.PatientService#startgetAll
	 */
	public void startgetAll(

			final com.medicare.services.patient.PatientServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[2].getName());
		_operationClient.getOptions().setAction("http://medicare.com/Services/Patient/GetAll");
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
							com.medicare.types.Patients.class, getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetAll((com.medicare.types.Patients) object);

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
		if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[2].setMessageReceiver(_callbackReceiver);
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

	// http://localhost:8080/NewService/services/PatientService
	private org.apache.axiom.om.OMElement toOM(com.medicare.types.PersonE param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.types.PersonE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.types.PatientE param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.types.PatientE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.types.Error param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.types.Error.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.services.patient.Notify param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.services.patient.Notify.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.types.Patients param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.types.Patients.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.medicare.types.PersonE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.medicare.types.PersonE.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.medicare.services.patient.Notify param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(com.medicare.services.patient.Notify.MY_QNAME, factory));
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

			if (com.medicare.services.patient.Notify.class.equals(type)) {

				return com.medicare.services.patient.Notify.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.types.Error.class.equals(type)) {

				return com.medicare.types.Error.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.types.PatientE.class.equals(type)) {

				return com.medicare.types.PatientE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.types.Patients.class.equals(type)) {

				return com.medicare.types.Patients.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.types.PersonE.class.equals(type)) {

				return com.medicare.types.PersonE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
