package com.app.mapstruct.mapper;

import org.mapstruct.Mapper;

import com.app.mapstruct.pojo.SimpleDestination;
import com.app.mapstruct.pojo.SimpleSource;

@Mapper(componentModel = "spring")
public interface SimpleSourceDestinationMapper {
   SimpleDestination sourceTODestination(SimpleSource source);
   SimpleSource destinationTOSource(SimpleDestination destination);
}
