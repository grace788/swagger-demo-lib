/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@wordnik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.Order;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for StoreApi
 */
@Ignore
public class StoreApiTest {

    private final StoreApi api = new StoreApi();

    /**
     * Delete purchase order by ID
     *
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteOrderTest() throws Exception {
        String orderId = null;
        api.deleteOrder(orderId);

        // TODO: test validations
    }
    /**
     * Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInventoryTest() throws Exception {
        Map<String, Integer> response = api.getInventory();

        // TODO: test validations
    }
    /**
     * Find purchase order by ID
     *
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOrderByIdTest() throws Exception {
        String orderId = null;
        Order response = api.getOrderById(orderId);

        // TODO: test validations
    }
    /**
     * Place an order for a pet
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void placeOrderTest() throws Exception {
        Order body = null;
        Order response = api.placeOrder(body);

        // TODO: test validations
    }
}
