package com.kessy.dao;

import java.util.ArrayList;
import java.util.List;

import com.kessy.entities.Contact;
import com.kessy.entities.TaskLight;

public class DataProvider {
	
	private static DataProvider instance = new DataProvider();
	private List<TaskLight> tasks;
	
	public static synchronized DataProvider getInstance() {
		return instance;
	}

	public DataProvider() {
		tasks = new ArrayList<TaskLight>();
		TaskLight task = new TaskLight("99999999", "12313123", "123213213213",
				"АЛЬФАТранс", "16:00", "Василий",
				"ул.Петра Алексеева д.19 оф.78", "обычный комментарий",
				"Создано диспетчером", "12:00", new Contact("Аня", "", "89517112527"));
		tasks.add(task);
		task = new TaskLight("1231313123", "12313123", "123213213213", "ВТБ24",
				"14:00", "Василий", "пр.Строителей д.19 оф.78",
				"обычный комментарий", "Принято оператором", "12:00",
				new Contact("Вера", "Секретарь", "89517112527"));
		tasks.add(task);
		task = new TaskLight("1231313123", "12313123", "123213213213",
				"Смоленский Банк", "17:00", "Василий", "ул.Кирова д.19 оф.78",
				"обычный комментарий", "Выполнено", "15:00", new Contact(
						"Света", "Менеджер", "89517112527"));
		tasks.add(task);
	}
	
	public List<TaskLight> getAllTaskLight() {
		return tasks;
	}

	public void addTask(String courierId, String address, String notes) {
		if (courierId == null || courierId.isEmpty())
			courierId = "";
		if (address == null || address.isEmpty())
			address = "";
		if (notes == null || notes.isEmpty())
			notes = "";
		
		TaskLight task = new TaskLight("", "12313123", courierId,
				"Test", "16:00", "Василий",
				address, notes,
				"Создано диспетчером", "12:00", new Contact("Аня", "", "89517112527"));
		tasks.add(task);
	}
}
