package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BuildingLine;
import com.example.demo.entity.GenericFeature;
import com.example.demo.entity.HistoricalSite;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("/")
	public void run() {
		
		BuildingLine testa1 = new BuildingLine();
		testa1.setId("a1");
		testa1.setName("test1");
		testa1.setSomeAttribute("someAttribute");
		testa1.setDate(LocalDate.now());
		
		BuildingLine testa2 = new BuildingLine();
		testa2.setId("a2");
		testa2.setName("test2");
		testa2.setSomeAttribute("someAttribute");
		
		HistoricalSite testb1 = new HistoricalSite();
		testb1.setId("b1");
		testb1.setName("test2");
		testb1.setSomeOtherAttribute("someOtherAttribute");
		testb1.setDate(LocalDate.now());
		
		HistoricalSite testb2 = new HistoricalSite();
		testb2.setId("b2");
		testb2.setName("test2");
		testb2.setSomeOtherAttribute("someOtherAttribute");
		
		demoService.save(testa1);
		demoService.save(testa2);
		demoService.save(testb1);
		demoService.save(testb2);
	
	}
	
	@GetMapping("/test")
	public <T extends GenericFeature> Iterable<T> yolo() {		
		
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) BuildingLine.class;
		
		return demoService.findAll(clazz);
	}
	
	@GetMapping("/test2")
	public <T extends GenericFeature> Iterable<T> yolo2() {	
		
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) HistoricalSite.class;

		return demoService.findAll(clazz);
		
	}

}
