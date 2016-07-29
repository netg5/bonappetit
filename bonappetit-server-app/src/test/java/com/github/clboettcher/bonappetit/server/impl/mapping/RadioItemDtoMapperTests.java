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
package com.github.clboettcher.bonappetit.server.impl.mapping;

/**
 * Tests for {@link RadioItemDtoMapper}.
 */
public class RadioItemDtoMapperTests {

    // TODO repair
//    /**
//     * Tests the full conversion of all fields of {@link RadioItem}.
//     */
//    @Test
//    public void testFullConversion() throws Exception {
//        RadioItem input01 = RadioItem.builder()
//                .id(1)
//                .index(0)
//                .priceDiff(new BigDecimal("1.5"))
//                .title("Test Radio-Item 01")
//                .build();
//
//        RadioItemDto expected01 = RadioItemDto.builder()
//                .id(1L)
//                .index(0)
//                .priceDiff(new BigDecimal("1.5"))
//                .title("Test Radio-Item 01")
//                .build();
//
//        Set<RadioItemDto> actual = RadioItemDtoMapper.INSTANCE.mapToRadioItemDtos(Sets.newLinkedHashSet(
//                Collections.singletonList(input01)));
//        final Set<RadioItemDto> expectedDtos = Sets.newHashSet(expected01);
//        assertThat(actual, is(expectedDtos));
//    }
}
