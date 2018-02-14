

/**
 * BookPriceServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.example.www.bookquote;

    /*
     *  BookPriceServiceTest Junit test case
    */

    public class BookPriceServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testgetBookPrice() throws java.lang.Exception{

        com.example.www.bookquote.BookPriceServiceStub stub =
                    new com.example.www.bookquote.BookPriceServiceStub();//the default implementation should point to the right endpoint

           com.example.www.bookquote.BookPriceServiceStub.GetBookPrice getBookPrice4=
                                                        (com.example.www.bookquote.BookPriceServiceStub.GetBookPrice)getTestObject(com.example.www.bookquote.BookPriceServiceStub.GetBookPrice.class);
                    // TODO : Fill in the getBookPrice4 here
                	getBookPrice4.setIsbn("1");
                	
                        assertNotNull(stub.getBookPrice(
                        getBookPrice4));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetBookPrice() throws java.lang.Exception{
            com.example.www.bookquote.BookPriceServiceStub stub = new com.example.www.bookquote.BookPriceServiceStub();
             com.example.www.bookquote.BookPriceServiceStub.GetBookPrice getBookPrice4=
                                                        (com.example.www.bookquote.BookPriceServiceStub.GetBookPrice)getTestObject(com.example.www.bookquote.BookPriceServiceStub.GetBookPrice.class);
                    // TODO : Fill in the getBookPrice4 here
                

                stub.startgetBookPrice(
                         getBookPrice4,
                    new tempCallbackN65548()
                );
              


        }

        private class tempCallbackN65548  extends com.example.www.bookquote.BookPriceServiceCallbackHandler{
            public tempCallbackN65548(){ super(null);}

            public void receiveResultgetBookPrice(
                         com.example.www.bookquote.BookPriceServiceStub.GetBookPriceResponse result
                            ) {
                
            }

            public void receiveErrorgetBookPrice(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    