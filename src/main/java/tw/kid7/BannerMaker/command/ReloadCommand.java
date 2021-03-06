package tw.kid7.BannerMaker.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import tw.kid7.BannerMaker.BannerMaker;
import tw.kid7.BannerMaker.configuration.Language;
import tw.kid7.BannerMaker.util.MessageUtil;

class ReloadCommand extends AbstractCommand {
    //名稱
    private static final String name = "Reload";
    //介紹
    private static final String description = "Reload all config";
    //權限
    private static final String permission = "BannerMaker.reload";
    //使用方法
    private static final String usage = "/bm reload";
    //僅能由玩家執行
    private static final boolean onlyFromPlayer = false;

    ReloadCommand() {
        super(name, description, permission, usage, onlyFromPlayer);
    }

    @Override
    boolean handle(CommandSender sender, Command command, String label, String[] args) {
        BannerMaker.reload();
        sender.sendMessage(MessageUtil.format(true, Language.get("general.reload")));
        return true;
    }
}
