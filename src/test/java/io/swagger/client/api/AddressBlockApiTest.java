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
import io.swagger.client.model.AddressBlock;
import io.swagger.client.model.AddressBlockInput;
import io.swagger.client.model.ErrorModel;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressBlockApi
 */
@Ignore
public class AddressBlockApiTest {

    private final AddressBlockApi api = new AddressBlockApi();

    
    /**
     * 
     *
     * Creates a new address block in the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAddressBlockTest() throws ApiException {
        AddressBlockInput addressBlocks = null;
        AddressBlock response = api.addAddressBlock(addressBlocks);

        // TODO: test validations
    }
    
    /**
     * Find Address block by ID
     *
     * Returns a single address block if the user has access
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAddressBlockByIdTest() throws ApiException {
        Long id = null;
        AddressBlock response = api.findAddressBlockById(id);

        // TODO: test validations
    }
    
    /**
     * All address block
     *
     * Returns all address block from the system that the user has access to
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAddressBlocksTest() throws ApiException {
        List<String> tags = null;
        Integer limit = null;
        List<AddressBlock> response = api.findAddressBlocks(tags, limit);

        // TODO: test validations
    }
    
}
