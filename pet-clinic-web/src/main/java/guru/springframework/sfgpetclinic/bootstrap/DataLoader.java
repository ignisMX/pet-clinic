package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.service.OwnerService;
import guru.springframework.sfgpetclinic.service.VetService;
import guru.springframework.sfgpetclinic.service.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner ownerOne = new Owner();
        ownerOne.setId(1L);
        ownerOne.setFirstName("Michael");
        ownerOne.setLastName("Weston");

        ownerService.save(ownerOne);

        Owner ownerTwo = new Owner();
        ownerTwo.setId(2L);
        ownerTwo.setFirstName("Fiona");
        ownerTwo.setLastName("Glenanne");

        ownerService.save(ownerTwo);

        System.out.println("Load owners ...");

        Vet vetOne = new Vet();
        vetOne.setId(1L);
        vetOne.setFirstName("Same");
        vetOne.setLastName("Axe");

        vetService.save(vetOne);

        Vet vetTwo = new Vet();
        vetTwo.setId(2L);
        vetTwo.setFirstName("Omar");
        vetTwo.setLastName("Alvarez");

        vetService.save(vetTwo);

        System.out.println("Load vets ...");
    }
}
