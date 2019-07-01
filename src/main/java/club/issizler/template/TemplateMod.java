package club.issizler.template;

import club.issizler.okyanus.api.Mod;
import club.issizler.okyanus.api.cmd.CommandBuilder;

public class TemplateMod extends Mod {

    @Override
    public void init() {
        getServer().getLogger().info("Hello, world!");

        registerCommand(
                new CommandBuilder("hello")
                        .run(source -> {
                            source.send("Hello, world!");
                            return 1;
                        })
        );
    }

}
