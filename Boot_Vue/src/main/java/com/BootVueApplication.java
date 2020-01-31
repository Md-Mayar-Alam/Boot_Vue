package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootVueApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BootVueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Stream.of("Vegetables", "Cheese", "Burger", "Meat", "Biryani")
				.map(new Function<String, Item>() {
					@Override
					public Item apply(String itemName) {
						return new Item(itemName);
					}
				})
				.forEach(new Consumer<Item>() {
					@Override
					public void accept(Item item) {
						itemRepository.save(item);
					}
				});*/
	}
}
