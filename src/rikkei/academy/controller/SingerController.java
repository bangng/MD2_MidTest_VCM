package rikkei.academy.controller;

import rikkei.academy.model.Singer;
import rikkei.academy.service.Singer.ISingerService;
import rikkei.academy.service.Singer.SingerServiceIPL;

import java.util.List;

public class SingerController {
public ISingerService singerService = new SingerServiceIPL();
public List<Singer> showListSinger(){
    return singerService.findAll();

}
public void addSinger(Singer singer){
    singerService.save(singer);
}
public void deleteSinger(int id){
    singerService.deleteById(id);
}
public Singer detailSinger(int id){
    return singerService.findById(id);
}
public void sortSinger(){
singerService.sort();

}
public void editSinger(int id,Singer singer){
    singerService.edit(id, singer);
}


}
