
/**
 * ScheduledTreatment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

            
                package com.medicare.types;
            

            /**
            *  ScheduledTreatment bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ScheduledTreatment
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ScheduledTreatment
                Namespace URI = http://medicare.com/Types
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Treatment
                        */

                        
                                    protected com.medicare.types.Treatment localTreatment ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.medicare.types.Treatment
                           */
                           public  com.medicare.types.Treatment getTreatment(){
                               return localTreatment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Treatment
                               */
                               public void setTreatment(com.medicare.types.Treatment param){
                            
                                            this.localTreatment=param;
                                       

                               }
                            

                        /**
                        * field for Doctor
                        * This was an Array!
                        */

                        
                                    protected com.medicare.types.Doctor[] localDoctor ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.medicare.types.Doctor[]
                           */
                           public  com.medicare.types.Doctor[] getDoctor(){
                               return localDoctor;
                           }

                           
                        


                               
                              /**
                               * validate the array for Doctor
                               */
                              protected void validateDoctor(com.medicare.types.Doctor[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param Doctor
                              */
                              public void setDoctor(com.medicare.types.Doctor[] param){
                              
                                   validateDoctor(param);

                               
                                      this.localDoctor=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.medicare.types.Doctor
                             */
                             public void addDoctor(com.medicare.types.Doctor param){
                                   if (localDoctor == null){
                                   localDoctor = new com.medicare.types.Doctor[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDoctor);
                               list.add(param);
                               this.localDoctor =
                             (com.medicare.types.Doctor[])list.toArray(
                            new com.medicare.types.Doctor[list.size()]);

                             }
                             

                        /**
                        * field for Patient
                        * This was an Array!
                        */

                        
                                    protected com.medicare.types.Patient[] localPatient ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.medicare.types.Patient[]
                           */
                           public  com.medicare.types.Patient[] getPatient(){
                               return localPatient;
                           }

                           
                        


                               
                              /**
                               * validate the array for Patient
                               */
                              protected void validatePatient(com.medicare.types.Patient[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param Patient
                              */
                              public void setPatient(com.medicare.types.Patient[] param){
                              
                                   validatePatient(param);

                               
                                      this.localPatient=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.medicare.types.Patient
                             */
                             public void addPatient(com.medicare.types.Patient param){
                                   if (localPatient == null){
                                   localPatient = new com.medicare.types.Patient[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPatient);
                               list.add(param);
                               this.localPatient =
                             (com.medicare.types.Patient[])list.toArray(
                            new com.medicare.types.Patient[list.size()]);

                             }
                             

                        /**
                        * field for Room
                        */

                        
                                    protected com.medicare.types.Room localRoom ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.medicare.types.Room
                           */
                           public  com.medicare.types.Room getRoom(){
                               return localRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Room
                               */
                               public void setRoom(com.medicare.types.Room param){
                            
                                            this.localRoom=param;
                                       

                               }
                            

                        /**
                        * field for Timeslot
                        */

                        
                                    protected com.medicare.types.Timeslot localTimeslot ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.medicare.types.Timeslot
                           */
                           public  com.medicare.types.Timeslot getTimeslot(){
                               return localTimeslot;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Timeslot
                               */
                               public void setTimeslot(com.medicare.types.Timeslot param){
                            
                                            this.localTimeslot=param;
                                       

                               }
                            

                        /**
                        * field for Id
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localId ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(java.lang.String param){
                            
                                            this.localId=param;
                                       

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://medicare.com/Types");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ScheduledTreatment",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ScheduledTreatment",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localId != null){
                                        
                                                writeAttribute("http://medicare.com/Types",
                                                         "id",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId), xmlWriter);

                                            
                                      }
                                    
                                            if (localTreatment==null){
                                                 throw new org.apache.axis2.databinding.ADBException("treatment cannot be null!!");
                                            }
                                           localTreatment.serialize(new javax.xml.namespace.QName("http://medicare.com/Types","treatment"),
                                               xmlWriter);
                                        
                                       if (localDoctor!=null){
                                            for (int i = 0;i < localDoctor.length;i++){
                                                if (localDoctor[i] != null){
                                                 localDoctor[i].serialize(new javax.xml.namespace.QName("http://medicare.com/Types","doctor"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                           throw new org.apache.axis2.databinding.ADBException("doctor cannot be null!!");
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("doctor cannot be null!!");
                                        
                                    }
                                 
                                       if (localPatient!=null){
                                            for (int i = 0;i < localPatient.length;i++){
                                                if (localPatient[i] != null){
                                                 localPatient[i].serialize(new javax.xml.namespace.QName("http://medicare.com/Types","patient"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                           throw new org.apache.axis2.databinding.ADBException("patient cannot be null!!");
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("patient cannot be null!!");
                                        
                                    }
                                 
                                            if (localRoom==null){
                                                 throw new org.apache.axis2.databinding.ADBException("room cannot be null!!");
                                            }
                                           localRoom.serialize(new javax.xml.namespace.QName("http://medicare.com/Types","room"),
                                               xmlWriter);
                                        
                                            if (localTimeslot==null){
                                                 throw new org.apache.axis2.databinding.ADBException("timeslot cannot be null!!");
                                            }
                                           localTimeslot.serialize(new javax.xml.namespace.QName("http://medicare.com/Types","timeslot"),
                                               xmlWriter);
                                        
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://medicare.com/Types")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                            elementList.add(new javax.xml.namespace.QName("http://medicare.com/Types",
                                                                      "treatment"));
                            
                            
                                    if (localTreatment==null){
                                         throw new org.apache.axis2.databinding.ADBException("treatment cannot be null!!");
                                    }
                                    elementList.add(localTreatment);
                                
                             if (localDoctor!=null) {
                                 for (int i = 0;i < localDoctor.length;i++){

                                    if (localDoctor[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://medicare.com/Types",
                                                                          "doctor"));
                                         elementList.add(localDoctor[i]);
                                    } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("doctor cannot be null !!");
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("doctor cannot be null!!");
                                    
                             }

                        
                             if (localPatient!=null) {
                                 for (int i = 0;i < localPatient.length;i++){

                                    if (localPatient[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://medicare.com/Types",
                                                                          "patient"));
                                         elementList.add(localPatient[i]);
                                    } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("patient cannot be null !!");
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("patient cannot be null!!");
                                    
                             }

                        
                            elementList.add(new javax.xml.namespace.QName("http://medicare.com/Types",
                                                                      "room"));
                            
                            
                                    if (localRoom==null){
                                         throw new org.apache.axis2.databinding.ADBException("room cannot be null!!");
                                    }
                                    elementList.add(localRoom);
                                
                            elementList.add(new javax.xml.namespace.QName("http://medicare.com/Types",
                                                                      "timeslot"));
                            
                            
                                    if (localTimeslot==null){
                                         throw new org.apache.axis2.databinding.ADBException("timeslot cannot be null!!");
                                    }
                                    elementList.add(localTimeslot);
                                
                            attribList.add(
                            new javax.xml.namespace.QName("http://medicare.com/Types","id"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ScheduledTreatment parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ScheduledTreatment object =
                new ScheduledTreatment();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"ScheduledTreatment".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ScheduledTreatment)com.medicare.services.patient.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "id"
                    java.lang.String tempAttribId =
                        
                                reader.getAttributeValue("http://medicare.com/Types","id");
                            
                   if (tempAttribId!=null){
                         java.lang.String content = tempAttribId;
                        
                                                 object.setId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribId));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("id");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://medicare.com/Types","treatment").equals(reader.getName())){
                                
                                                object.setTreatment(com.medicare.types.Treatment.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://medicare.com/Types","doctor").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.medicare.types.Doctor.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://medicare.com/Types","doctor").equals(reader.getName())){
                                                                    list2.add(com.medicare.types.Doctor.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDoctor((com.medicare.types.Doctor[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.medicare.types.Doctor.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://medicare.com/Types","patient").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(com.medicare.types.Patient.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://medicare.com/Types","patient").equals(reader.getName())){
                                                                    list3.add(com.medicare.types.Patient.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPatient((com.medicare.types.Patient[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.medicare.types.Patient.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://medicare.com/Types","room").equals(reader.getName())){
                                
                                                object.setRoom(com.medicare.types.Room.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://medicare.com/Types","timeslot").equals(reader.getName())){
                                
                                                object.setTimeslot(com.medicare.types.Timeslot.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    