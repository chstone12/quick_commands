package chstone12.quick_commands;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_2168;

public class suggestions_help implements SuggestionProvider<class_2168> {
    @Override
    public CompletableFuture<Suggestions> getSuggestions(CommandContext<class_2168> context, SuggestionsBuilder builder) throws CommandSyntaxException {


        builder.suggest("q_NUMBER");
        builder.suggest("q_s");
        builder.suggest("q_se");
        builder.suggest("q_see");
        builder.suggest("q_t");
        builder.suggest("q_sm");
        builder.suggest("q_ts");
        builder.suggest("q_smb");
        builder.suggest("q_smi");
        builder.suggest("q_smt");
        builder.suggest("q_ta");
        builder.suggest("q_ench");
        builder.suggest("q_rt");
        builder.suggest("q_gd");
        builder.suggest("q_gr");
        builder.suggest("q_gen");
        builder.suggest("q_ETC");
        builder.suggest("qd_NUMBER");
        builder.suggest("qd_STRING");
        builder.suggest("qd_inv");
        builder.suggest("qd_ai");
        builder.suggest("qd_as");
        builder.suggest("qd_t");
        builder.suggest("qd_i");
        builder.suggest("q_tp");
        builder.suggest("qd_r");




        return builder.buildFuture();
    }
}
