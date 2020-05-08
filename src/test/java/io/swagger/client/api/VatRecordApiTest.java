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
import io.swagger.client.model.VatRecord;
import io.swagger.client.model.VatRecordInput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VatRecordApi
 */
@Ignore
public class VatRecordApiTest {

    private final VatRecordApi api = new VatRecordApi();

    
    /**
     * 
     *
     * Creates a new vat record in the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addVatRecordTest() throws ApiException {
        VatRecordInput vatRecords = null;
        VatRecord response = api.addVatRecord(vatRecords);

        // TODO: test validations
    }
    
    /**
     * Find VAT record by ID
     *
     * Returns a single vat record if the user has access
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findVatRecordByIdTest() throws ApiException {
        Long id = null;
        VatRecord response = api.findVatRecordById(id);

        // TODO: test validations
    }
    
    /**
     * All vat record
     *
     * Returns all vat record from the system that the user has access to
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findVatRecordsTest() throws ApiException {
        List<String> tags = null;
        Integer limit = null;
        List<VatRecord> response = api.findVatRecords(tags, limit);

        // TODO: test validations
    }
    
}