package ru.kviak.coffeeorder.service.order;

import ru.kviak.coffeeorder.dto.OrderEventDto;
import ru.kviak.coffeeorder.model.EventOrder;
import ru.kviak.coffeeorder.service.EventService;

public interface OrderService<T extends OrderEventDto> extends EventService {

    EventOrder publishEvent(T event);

    //Order findOrder(int id);
}
