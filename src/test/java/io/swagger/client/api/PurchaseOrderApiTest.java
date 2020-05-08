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
import io.swagger.client.model.PurchaseOrder;
import io.swagger.client.model.PurchaseOrderInput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PurchaseOrderApi
 */
@Ignore
public class PurchaseOrderApiTest {

    private final PurchaseOrderApi api = new PurchaseOrderApi();

    
    /**
     * 
     *
     * Creates a new purchase order in the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPurchaseOrderTest() throws ApiException {
        PurchaseOrderInput purchaseOrders = null;
        PurchaseOrder response = api.addPurchaseOrder(purchaseOrders);

        // TODO: test validations
    }
    
    /**
     * Find Purchase order by ID
     *
     * Returns a single purchase order if the user has access
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPurchaseOrderByIdTest() throws ApiException {
        Long id = null;
        PurchaseOrder response = api.findPurchaseOrderById(id);

        // TODO: test validations
    }
    
    /**
     * All purchase order
     *
     * Returns all purchase order from the system that the user has access to
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPurchaseOrdersTest() throws ApiException {
        List<String> tags = null;
        Integer limit = null;
        List<PurchaseOrder> response = api.findPurchaseOrders(tags, limit);

        // TODO: test validations
    }
    
}
