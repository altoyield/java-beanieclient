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
import io.swagger.client.model.VatReturn;
import io.swagger.client.model.VatReturnInput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VatReturnApi
 */
@Ignore
public class VatReturnApiTest {

    private final VatReturnApi api = new VatReturnApi();

    
    /**
     * 
     *
     * Creates a new vat return in the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addVatReturnTest() throws ApiException {
        VatReturnInput vatReturns = null;
        VatReturn response = api.addVatReturn(vatReturns);

        // TODO: test validations
    }
    
    /**
     * Find VAT return by ID
     *
     * Returns a single vat return if the user has access
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findVatReturnByIdTest() throws ApiException {
        Long id = null;
        VatReturn response = api.findVatReturnById(id);

        // TODO: test validations
    }
    
    /**
     * All vat return
     *
     * Returns all vat return from the system that the user has access to
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findVatReturnsTest() throws ApiException {
        List<String> tags = null;
        Integer limit = null;
        List<VatReturn> response = api.findVatReturns(tags, limit);

        // TODO: test validations
    }
    
}
