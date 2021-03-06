/*
 * Copyright (c) 2016 Claudius Boettcher (pos.bonappetit@gmail.com)
 *
 * This file is part of BonAppetit. BonAppetit is an Android based
 * Point-of-Sale client-server application for small restaurants.
 *
 * BonAppetit is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BonAppetit is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with BonAppetit.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.clboettcher.bonappetit.server.menu.impl.mapping.todto;

import com.github.clboettcher.bonappetit.server.menu.api.dto.read.MenuDto;
import com.github.clboettcher.bonappetit.server.menu.impl.entity.menu.MenuEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(uses = ItemDtoMapper.class, componentModel = "spring")
public interface MenuDtoMapper {

    /**
     * Maps the given {@link MenuEntity}s to {@link MenuDto}s.
     *
     * @param menus The {@link MenuEntity}s to map.
     * @return The resulting {@link MenuDto}s.
     */
    List<MenuDto> mapToMenuDtos(List<MenuEntity> menus);

    /**
     * Maps the given {@link MenuEntity} to a {@link MenuDto}.
     *
     * @param menu The {@link MenuEntity} to map.
     * @return The resulting {@link MenuDto}.
     */
    MenuDto mapToMenuDto(MenuEntity menu);
}
