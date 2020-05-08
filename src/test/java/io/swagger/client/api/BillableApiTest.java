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
import io.swagger.client.model.Billable;
import io.swagger.client.model.BillableInput;
import io.swagger.client.model.ErrorModel;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillableApi
 */
@Ignore
public class BillableApiTest {

    private final BillableApi api = new BillableApi();

    
    /**
     * 
     *
     * Creates a new billable record in the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBillableTest() throws ApiException {
        BillableInput billables = null;
        Billable response = api.addBillable(billables);

        // TODO: test validations
    }
    
    /**
     * Find Billable record by ID
     *
     * Returns a single billable record if the user has access
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findBillableByIdTest() throws ApiException {
        Long id = null;
        Billable response = api.findBillableById(id);

        // TODO: test validations
    }
    
    /**
     * All billable record
     *
     * Returns all billable record from the system that the user has access to
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findBillablesTest() throws ApiException {
        List<String> tags = null;
        Integer limit = null;
        List<Billable> response = api.findBillables(tags, limit);

        // TODO: test validations
    }
    
}
