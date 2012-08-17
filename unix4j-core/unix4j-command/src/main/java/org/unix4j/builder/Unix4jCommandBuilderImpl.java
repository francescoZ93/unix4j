package org.unix4j.builder;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Collection;

import org.unix4j.command.Command;
import org.unix4j.io.Input;
import org.unix4j.redirect.From;
import org.unix4j.unix.Cut;
import org.unix4j.unix.Echo;
import org.unix4j.unix.Grep;
import org.unix4j.unix.Head;
import org.unix4j.unix.Ls;
import org.unix4j.unix.Sed;
import org.unix4j.unix.Sort;
import org.unix4j.unix.Tail;
import org.unix4j.unix.Wc;
import org.unix4j.unix.Xargs;
import org.unix4j.unix.ls.LsOptions;

public class Unix4jCommandBuilderImpl extends DefaultCommandBuilder implements Unix4jCommandBuilder {

	public Unix4jCommandBuilderImpl() {
		super();
	}
	public Unix4jCommandBuilderImpl(Input input) {
		super(input);
	}

	@Override
	public Unix4jCommandBuilder fromString(String input) {
		join(From.FACTORY.fromString(input));
		return this;
	}

	@Override
	public Unix4jCommandBuilder fromStrings(String... input) {
		join(From.FACTORY.fromStrings(input));
		return this;
	}

	@Override
	public Unix4jCommandBuilder from(Collection<String> input) {
		join(From.FACTORY.from(input));
		return this;
	}

	@Override
	public Unix4jCommandBuilder fromFile(String file) {
		join(From.FACTORY.fromFile(file));
		return this;
	}

	public Unix4jCommandBuilder cat(String file) {
		join(From.FACTORY.fromFile(file));
		return this;
	}

	@Override
	public Unix4jCommandBuilder from(File file) {
		join(From.FACTORY.from(file));
		return this;
	}

	public Unix4jCommandBuilder cat(File file) {
		join(From.FACTORY.from(file));
		return this;
	}

	@Override
	public Unix4jCommandBuilder fromResource(String resource) {
		join(From.FACTORY.fromResource(resource));
		return this;
	}

	@Override
	public Unix4jCommandBuilder from(InputStream stream) {
		join(From.FACTORY.from(stream));
		return this;
	}

	@Override
	public Unix4jCommandBuilder from(URL url) {
		join(From.FACTORY.from(url));
		return this;
	}

	@Override
	public Unix4jCommandBuilder from(Reader reader) {
		join(From.FACTORY.from(reader));
		return this;
	}

	@Override
	public Unix4jCommandBuilder from(Input input) {
		join(From.FACTORY.from(input));
		return this;
	}

	@Override
	public Unix4jCommandBuilder ls() {
		join(Ls.FACTORY.ls());
		return this;
	}

	@Override
	public Unix4jCommandBuilder ls(File... files) {
		join(Ls.FACTORY.ls(files));
		return this;
	}

	@Override
	public Unix4jCommandBuilder ls(String... files) {
		join(Ls.FACTORY.ls(files));
		return this;
	}

	@Override
	public Unix4jCommandBuilder ls(LsOptions options) {
		join(Ls.FACTORY.ls(options));
		return this;
	}

	@Override
	public Unix4jCommandBuilder ls(LsOptions options, File... files) {
		join(Ls.FACTORY.ls(options, files));
		return this;
	}

	@Override
	public Unix4jCommandBuilder ls(LsOptions options, String... files) {
		join(Ls.FACTORY.ls(options, files));
		return this;
	}

	@Override
	public Unix4jCommandBuilder grep(String matchString) {
		join(Grep.FACTORY.grep(matchString));
		return this;
	}

	@Override
	public Unix4jCommandBuilder grep(String matchString, Grep.Option... options) {
		join(Grep.FACTORY.grep(matchString, options));
		return this;
	}

	@Override
	public Unix4jCommandBuilder echo(String message) {
		join(Echo.FACTORY.echo(message));
		return this;
	}

	@Override
	public Unix4jCommandBuilder echo(String... messages) {
		join(Echo.FACTORY.echo(messages));
		return this;
	}

	@Override
	public Unix4jCommandBuilder sort() {
		join(Sort.FACTORY.sort());
		return this;
	}

	@Override
	public Unix4jCommandBuilder sort(Sort.Option... options) {
		join(Sort.FACTORY.sort(options));
		return this;
	}

	@Override
	public Unix4jCommandBuilder sortAscending() {
		join(Sort.FACTORY.sortAscending());
		return this;
	}

	@Override
	public Unix4jCommandBuilder sortDescending() {
		join(Sort.FACTORY.sortDescending());
		return this;
	}

	@Override
	public Unix4jCommandBuilder cut(int fieldIndex) {
		join(Cut.FACTORY.cut(fieldIndex));
		return this;
	}

	@Override
	public Unix4jCommandBuilder cut(String delimiter, int... fieldIndices) {
		join(Cut.FACTORY.cut(delimiter, fieldIndices));
		return this;
	}

	@Override
	public Unix4jCommandBuilder cut(String inputDelimiter, String outputDelimiter, int... fieldIndices) {
		join(Cut.FACTORY.cut(inputDelimiter, outputDelimiter, fieldIndices));
		return this;
	}

	@Override
	public Unix4jCommandBuilder cut(int start, int length) {
		join(Cut.FACTORY.cut(start, length));
		return this;
	}

	@Override
	public Unix4jCommandBuilder cut(int[] charIndices) {
		join(Cut.FACTORY.cut(charIndices));
		return this;
	}

	@Override
	public Unix4jCommandBuilder sed(String script) {
		join(Sed.FACTORY.sed(script));
		return this;
	}

	@Override
	public Unix4jCommandBuilder sedSubstitute(String searchExpression, String replaceExpression) {
		join(Sed.FACTORY.sedSubstitute(searchExpression, replaceExpression));
		return this;
	}

	@Override
	public Unix4jCommandBuilder sedSubstituteFirst(String searchExpression, String replaceExpression) {
		join(Sed.FACTORY.sedSubstituteFirst(searchExpression, replaceExpression));
		return this;
	}

	@Override
	public Unix4jCommandBuilder xargs() {
		join(Xargs.FACTORY.xargs());
		return this;
	}

	@Override
	public Unix4jCommandBuilder join(Command<?> command) {
		super.join(command);
		return this;
	}

	@Override
	public Unix4jCommandBuilder wc() {
		join(Wc.FACTORY.wc());
		return this;
	}

	@Override
	public Unix4jCommandBuilder wcCountLinesWordsAndChars() {
		join(Wc.FACTORY.wcCountLinesWordsAndChars());
		return this;
	}

	@Override
	public Unix4jCommandBuilder wc(Wc.Option... options) {
		join(Wc.FACTORY.wc(options));
		return this;
	}

	@Override
	public Unix4jCommandBuilder wcCountLines() {
		join(Wc.FACTORY.wcCountLines());
		return this;
	}

	@Override
	public Unix4jCommandBuilder wcCountChars() {
		join(Wc.FACTORY.wcCountChars());
		return this;
	}

	@Override
	public Unix4jCommandBuilder wcCountWords() {
		join(Wc.FACTORY.wcCountWords());
		return this;
	}

	@Override
	public Unix4jCommandBuilder head(int lines) {
		join(Head.FACTORY.head(lines));
		return this;
	}

	@Override
	public Unix4jCommandBuilder head() {
		join(Head.FACTORY.head());
		return this;
	}

	@Override
	public Unix4jCommandBuilder tail(int lines) {
		join(Tail.FACTORY.tail(lines));
		return this;
	}

	@Override
	public Unix4jCommandBuilder tail() {
		join(Tail.FACTORY.tail());
		return this;
	}
}
