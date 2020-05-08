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
import io.swagger.client.model.StockSupplier;
import io.swagger.client.model.StockSupplierInput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StockSupplierApi
 */
@Ignore
public class StockSupplierApiTest {

    private final StockSupplierApi api = new StockSupplierApi();

    
    /**
     * 
     *
     * Creates a new stock supplier in the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addStockSupplierTest() throws ApiException {
        StockSupplierInput stockSuppliers = null;
        StockSupplier response = api.addStockSupplier(stockSuppliers);

        // TODO: test validations
    }
    
    /**
     * Find Stock supplier by ID
     *
     * Returns a single stock supplier if the user has access
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findStockSupplierByIdTest() throws ApiException {
        Long id = null;
        StockSupplier response = api.findStockSupplierById(id);

        // TODO: test validations
    }
    
    /**
     * All stock supplier
     *
     * Returns all stock supplier from the system that the user has access to
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findStockSuppliersTest() throws ApiException {
        List<String> tags = null;
        Integer limit = null;
        List<StockSupplier> response = api.findStockSuppliers(tags, limit);

        // TODO: test validations
    }
    
}