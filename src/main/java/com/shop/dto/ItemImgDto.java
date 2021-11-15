package com.shop.dto;

import com.shop.entity.ItemImg;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class ItemImgDto {

    private Long id;

    private String imgName;

    private String oriImgName;

    private String imgUrl;

    private String repImgYn;

    private static ModelMapper modelMapper = new ModelMapper();    // 멤버 변수로 모델 객체 추가

    // ItemImg 객체 자료형과 멤버 변수 이름이 같을 때 ItemImgDto로 값을 복사, 반환
    public static ItemImgDto of(ItemImg itemImg){
        return  modelMapper.map(itemImg, ItemImgDto.class);

    }
}
