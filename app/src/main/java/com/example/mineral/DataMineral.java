package com.example.mineral;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataMineral {
    private static String [] namamineral = {
            "Aqua",
            "Ades",
            "Club",
            "Cleo",
            "Le Minerale",

    };

    private static String [] detailmineral = {
            "Aqua adalah air mineral umum yang sudah dikenal baik oleh masyarakat dengan harga Rp.5000.",
            "Ades adalah air mineral umum yang sudah dikenal baik oleh masyarakat dengan harga Rp.4000.",
            "Club adalah air mineral umum yang sudah dikenal baik oleh masyarakat dengan harga Rp.5000",
            "Cleo adalah air mineral umum yang sudah dikenal baik oleh masyarakat dengan harga Rp.5000",
            "Le Minerale adalah air mineral umum yang sudah dikenal baik oleh masyarakat dengan harga Rp.5000.",
    };

    private static int[] gambarmineral = {
            R.drawable.aqua,
            R.drawable.ades,
            R.drawable.club,
            R.drawable.cleo,
            R.drawable.minerale,
    };

    static ArrayList<Mineral> getListdata(){
        ArrayList<Mineral> list = new ArrayList<>();
        for (int position = 0; position <namamineral.length; position++) {
            Mineral mineral = new Mineral();
            mineral.setNama(namamineral[position]);
            mineral.setDetail(detailmineral[position]);
            mineral.setPhoto(gambarmineral[position]);
            list.add(mineral);
        }
        return list;
    }


}

