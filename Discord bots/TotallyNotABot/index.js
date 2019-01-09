const Discord = require('discord.js');

const commando = require('discord.js-commando');
const bot = new commando.Client();

bot.registry.registerGroup('random','Random');
bot.registry.registerDefaults(); //Register default commands
bot.registry.registerCommandsIn(__dirname + "/commands")

bot.login('login removed for privacy reasons');