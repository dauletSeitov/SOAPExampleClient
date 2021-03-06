
package com.example.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorI", targetNamespace = "http://demo.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorI {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://demo.example.com/", className = "com.example.demo.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://demo.example.com/", className = "com.example.demo.AddResponse")
    @Action(input = "http://demo.example.com/CalculatorI/addRequest", output = "http://demo.example.com/CalculatorI/addResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://demo.example.com/", className = "com.example.demo.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://demo.example.com/", className = "com.example.demo.DivideResponse")
    @Action(input = "http://demo.example.com/CalculatorI/divideRequest", output = "http://demo.example.com/CalculatorI/divideResponse")
    public int divide(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://demo.example.com/", className = "com.example.demo.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://demo.example.com/", className = "com.example.demo.MultiplyResponse")
    @Action(input = "http://demo.example.com/CalculatorI/multiplyRequest", output = "http://demo.example.com/CalculatorI/multiplyResponse")
    public int multiply(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://demo.example.com/", className = "com.example.demo.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://demo.example.com/", className = "com.example.demo.SubtractResponse")
    @Action(input = "http://demo.example.com/CalculatorI/subtractRequest", output = "http://demo.example.com/CalculatorI/subtractResponse")
    public int subtract(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
