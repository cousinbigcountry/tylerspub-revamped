package com.tylerspub.revamped.controllers;

import com.tylerspub.revamped.domain.Product;
import com.tylerspub.revamped.service.ProductService;
import com.tylerspub.revamped.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddProductController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/showProductFormForUpdate")
    public String showProductFormForUpdate(@RequestParam("productID") int theId, Model themodel){


        ProductService repo=context.getBean(ProductServiceImpl.class);

        String formtype;
        Product product = repo.findById(theId);
        themodel.addAttribute("product", product);
        formtype="productform";

        return formtype;
    }

    @GetMapping("/deleteproduct")
    public String deleteProduct(@RequestParam("productID") int theId, Model theModel) {
        ProductService repo=context.getBean(ProductServiceImpl.class);
        Product product = repo.findById(theId);

        if(product.getProducts().isEmpty()){
            repo.deleteById(theId);
            return "confirmationdeleteproduct";
        }
        else {
            return "negativeerror";
        }
    }
}
