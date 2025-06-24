package com.tylerspub.revamped.bootstrap;


import com.tylerspub.revamped.domain.Brunch;
import com.tylerspub.revamped.domain.Product;
import com.tylerspub.revamped.domain.Sides;
import com.tylerspub.revamped.repositories.*;
import org.hibernate.metamodel.mapping.ForeignKeyDescriptor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final AppetizersRepository appetizersRepository;
    private final BrunchRepository brunchRepository;
    private final DessertsRepository dessertsRepository;
    private final DrinksRepository drinksRepository;
    private final EntreesRepository entreesRepository;
    private final SidesRepository sidesRepository;

    public BootStrapData(ProductRepository productRepository, AppetizersRepository appetizersRepository, BrunchRepository brunchRepository, DessertsRepository dessertsRepository, DrinksRepository drinksRepository, EntreesRepository entreesRepository, SidesRepository sidesRepository) {
        this.productRepository = productRepository;
        this.appetizersRepository = appetizersRepository;
        this.brunchRepository = brunchRepository;
        this.dessertsRepository = dessertsRepository;
        this.drinksRepository = drinksRepository;
        this.entreesRepository = entreesRepository;
        this.sidesRepository = sidesRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("BootStrapData");
    }
}
