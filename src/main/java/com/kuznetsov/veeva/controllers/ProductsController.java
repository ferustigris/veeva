package com.kuznetsov.veeva.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/api/v14.0")
public class ProductsController {
    private Logger log = LoggerFactory.getLogger(ProductsController.class);

    @RequestMapping(value = "/objects/documents/*", headers="Authorization=F722BDCECDFE1B2E82234ABB82AAF2505676FE22DC380752E1D80150D909C86D5E1BE5DFBC762A24D55A0B9AE8781FA8")
    @ResponseBody()
    public String doc() {
        return "{ \"responseStatus\": \"SUCCESS\", \"document\": { \"id\": 450, \"binder__v\": false, \"allow_download_embedded_viewer__v\": true, \"reviewer__v\": { \"users\": [ 25519, 25516 ], \"groups\": [ 1358979070034 ] }, \"viewer__v\": { \"users\": [ 25519, 25516, 25597 ], \"groups\": [ 1358979070034 ] }, \"distribution_contacts__v\": { \"users\": [], \"groups\": [] }, \"consumer__v\": { \"users\": [], \"groups\": [] }, \"approver__v\": { \"users\": [ 25516 ], \"groups\": [] }, \"editor__v\": { \"users\": [ 25519, 25516 ], \"groups\": [] }, \"owner__v\": { \"users\": [ 46916 ], \"groups\": [] }, \"coordinator__v\": { \"users\": [], \"groups\": [] }, \"crosslink__v\": false, \"lifecycle__v\": \"General Lifecycle\", \"version_created_by__v\": 46916, \"language__v\": [ \"English\" ], \"minor_version_number__v\": 1, \"created_by__v\": 46916, \"annotations_lines__v\": 0, \"version_creation_date__v\": \"2015-03-12T16:24:33.539Z\", \"country__v\": [], \"md5checksum__v\": \"94e18bdbcf695c905a5968429e0c5204\", \"restrict_fragments_by_product__v\": true, \"annotations_notes__v\": 0, \"version_modified_date__v\": \"2015-03-12T16:24:54.000Z\", \"pages__v\": 1, \"major_version_number__v\": 1, \"annotations_anchors__v\": 0, \"product__v\": [ \"1357662840293\" ], \"export_filename__v\": \"451Chole\", \"annotations_resolved__v\": 0, \"type__v\": \"Reference Document\", \"size__v\": 11599, \"description__v\": \"This is my document.\", \"status__v\": \"Draft\", \"annotations_unresolved__v\": 0, \"document_creation_date__v\": \"2015-02-25T01:26:55.845Z\", \"locked__v\": false, \"format__v\": \"application/vnd.openxmlformats-officedocument.wordprocessingml.document\", \"annotations_links__v\": 0, \"document_number__v\": \"REF-0201\", \"annotations_all__v\": 0, \"last_modified_by__v\": 46916, \"name__v\": \"Cholecap Information\", \"subtype__v\": \"Prescribing Information\", }, \"renditions\": { \"viewable_rendition__v\": \"https://myvault.vaultdev.com/api/v12.0/objects/documents/450/renditions/viewable_rendition__v\" \"veeva_distribution_package__vs\": \"https://myvault.vaultdev.com/api/v12.0/objects/documents/450/renditions/veeva_distribution_package__vs\", }, \"versions\": [ { \"number\": \"0.1\", \"value\": \"https://myvault.vaultdev.com/api/v12.0/objects/documents/450/versions/0/1\" }, { \"number\": \"1.0\", \"value\": \"https://myvault.vaultdev.com/api/v12.0/objects/documents/450/versions/1/0\" }, { \"number\": \"1.1\", \"value\": \"https://myvault.vaultdev.com/api/v12.0/objects/documents/450/versions/1/1\" } ], \"attachments\": [ { \"id\": 547, \"url\": \"https://myvault.vaultdev.com/api/v12.0/objects/documents/450/attachments/547\" } ] }";
    }

    @RequestMapping(value = "/objects/documents",
            headers="Authorization=F722BDCECDFE1B2E82234ABB82AAF2505676FE22DC380752E1D80150D909C86D5E1BE5DFBC762A24D55A0B9AE8781FA8")
    @ResponseBody()
    public String docs() {
        return "{\"responseStatus\": \"SUCCESS\", \"sessionId\": \"F722BDCECDFE1B2E82234ABB82AAF2505676FE22DC380752E1D80150D909C86D5E1BE5DFBC762A24D55A0B9AE8781FA8\",    \"userId\": 65432,    \"vaultIds\": [        {            \"id\": 3123,            \"name\": \"PromoMats\",            \"url\": \"https://mypromomatsvault.veevavault.com/api\"        },        {            \"id\": 3456,            \"name\": \"eTMF\",            \"url\": \"https://myetmfvault.veevavault.com/api\"        }    ],    \"vaultId\": 3123}";
    }

    @RequestMapping(value = "/objects/users",
            headers="Authorization=F722BDCECDFE1B2E82234ABB82AAF2505676FE22DC380752E1D80150D909C86D5E1BE5DFBC762A24D55A0B9AE8781FA8")
    @ResponseBody()
    public String users() {
        return "{ \"responseStatus\": \"SUCCESS\", \"size\": 200, \"start\": 0, \"limit\": 200, \"sort\": \"id asc\", \"users\": [ { \"user\": { \"id\": 25501, \"user_name__v\": \"ewoodhouse@veevapharm.com\", \"user_first_name__v\": \"Elaine\", \"user_last_name__v\": \"Woodhouse\", }, { \"user\": { \"id\": 25502, \"user_name__v\": \"bashton@veevapharm.com\", \"user_first_name__v\": \"Bruce\", \"user_last_name__v\": \"Ashton\", }, { \"user\": { \"id\": 25503, \"user_name__v\": \"tchung@veevapharm.com\", \"user_first_name__v\": \"Thomas\", \"user_last_name__v\": \"Chung\", } ]}";
    }

    @RequestMapping("/auth")
    @ResponseBody()
    public String auth(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (username.equals("test") && password.equals("123456")) {
            return "{\"responseStatus\": \"SUCCESS\", \"sessionId\": \"F722BDCECDFE1B2E82234ABB82AAF2505676FE22DC380752E1D80150D909C86D5E1BE5DFBC762A24D55A0B9AE8781FA8\", \"userId\": 65432, \"vaultIds\": [ { \"id\": 3123, \"name\": \"PromoMats\", \"url\": \"https://mypromomatsvault.veevavault.com/api\" }, { \"id\": 3456, \"name\": \"eTMF\", \"url\": \"https://myetmfvault.veevavault.com/api\" } ], \"vaultId\": 3123}";
        }
        return "{ \"responseStatus\" : \"FAILURE\"**, \"errors\" : [ { \"type\" : \"NO_PASSWORD_PROVIDED\", \"message\" : \"No password was provided for the login call.\" } ], \"errorType\" : \"AUTHENTICATION_FAILED\" }";
    }

    @RequestMapping(
            value = "/*/versions/*/*/lifecycle_actions",
            headers="Authorization=F722BDCECDFE1B2E82234ABB82AAF2505676FE22DC380752E1D80150D909C86D5E1BE5DFBC762A24D55A0B9AE8781FA8")
    @ResponseBody()
    public String actions() {
        return "{\"responseStatus\":\"SUCCESS\",\"responseMessage\":\"Success\",\"lifecycle_actions__v\":[{\"name__v\":\"review1368038528904\",\"label__v\":\"Start Review\",\"lifecycle_action_type__v\":\"workflow\",\"entry_requirements__v\":\"https://zoetis-sbx-qualitydocs.veevavault.com/api/v14.0/objects/documents/1124/versions/4/0/lifecycle_actions/review1368038528904/entry_requirements\"},{\"name__v\":\"approval1368033024068\",\"label__v\":\"Start Approval\",\"lifecycle_action_type__v\":\"workflow\",\"entry_requirements__v\":\"https://zoetis-sbx-qualitydocs.veevavault.com/api/v14.0/objects/documents/1124/versions/4/0/lifecycle_actions/approval1368033024068/entry_requirements\"}]}";
    }

    @RequestMapping(
            value = "/*/versions/*/*/lifecycle_actions/*",
            headers="Authorization=F722BDCECDFE1B2E82234ABB82AAF2505676FE22DC380752E1D80150D909C86D5E1BE5DFBC762A24D55A0B9AE8781FA8",
            method = RequestMethod.PUT)
    @ResponseBody()
    public String action() {
        return "{" +
                "  \"responseStatus\": \"FAILURE\"," +
                "  \"id\": 222," +
                "  \"workflow_id__v\": \"115\"" +
                "}";
    }
    @RequestMapping(
            value = "/*/versions/*/*/lifecycle_actions/approval1368033024068",
            headers="Authorization=F722BDCECDFE1B2E82234ABB82AAF2505676FE22DC380752E1D80150D909C86D5E1BE5DFBC762A24D55A0B9AE8781FA8",
            method = RequestMethod.PUT)
    @ResponseBody()
    public String actionOk(@RequestParam("dueDate")String dueDate, @RequestParam("Approver")String Approver) {
        return "{" +
                "  \"responseStatus\": \"SUCCESS\"," +
                "  \"id\": 222," +
                "  \"workflow_id__v\": \"115\"" +
                "}";
    }
}
