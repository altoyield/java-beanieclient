/*
 * Beanie ERP API
 * An API specification for interacting with the Beanie ERP system
 *
 * OpenAPI spec version: 0.2
 * Contact: dev@bean.ie
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorModel;
import io.swagger.client.model.SalesInvoice;
import io.swagger.client.model.SalesInvoiceInput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SalesInvoiceApi
 */
@Ignore
public class SalesInvoiceApiTest {

    private final SalesInvoiceApi api = new SalesInvoiceApi();

    
    /**
     * 
     *
     * Creates a new sales invoice in the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSalesInvoiceTest() throws ApiException {
        SalesInvoiceInput salesInvoices = null;
        SalesInvoice response = api.addSalesInvoice(salesInvoices);

        // TODO: test validations
    }
    
    /**
     * Find Sales invoice by ID
     *
     * Returns a single sales invoice if the user has access
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findSalesInvoiceByIdTest() throws ApiException {
        Long id = null;
        SalesInvoice response = api.findSalesInvoiceById(id);

        // TODO: test validations
    }
    
    /**
     * All sales invoice
     *
     * Returns all sales invoice from the system that the user has access to
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findSalesInvoicesTest() throws ApiException {
        List<String> tags = null;
        Integer limit = null;
        List<SalesInvoice> response = api.findSalesInvoices(tags, limit);

        // TODO: test validations
    }
    
}
